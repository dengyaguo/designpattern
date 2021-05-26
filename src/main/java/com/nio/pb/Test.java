package com.nio.pb;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.openjdk.jol.info.GraphLayout;

public class Test {


    /**
     * Tag（下标和类型有关）+Length(可选)+Value（压缩）
     * 300
     * 0000 0000 0000 0000 0000 0001 0010 1100
     * 每7位为一组，如果还有有效位，则高位补1
     * 1010 1100 0000 0010
     * -84 2
     *
     * @param args
     * @throws InvalidProtocolBufferException
     */
    public static void main(String[] args) throws InvalidProtocolBufferException {
        PersonProto.Person.Builder builder = PersonProto.Person.newBuilder();
        PersonProto.Person pb_person = builder.setEmail("email").build();
        ByteString bytes = pb_person.toByteString();
        StringBuffer sb = new StringBuffer();
        bytes.forEach(aByte -> {
            String s = aByte.byteValue() + "";
            sb.append(s).append(" ");
        });
        System.out.println(sb.toString());//10 4 110 97 109 101 16 -84 2 26 5 101 109 97 105 108
        System.out.println("pb-java对象内存：" + bytes.size());
        Person java_person = new Person();
        java_person.setId(300);
        java_person.setName("name");
        java_person.setEmail("email");
        System.out.println("原生-java对象内存：" + GraphLayout.parseInstance(java_person).totalSize());

        PersonProto.Person person = PersonProto.Person.parseFrom(bytes);
        //JsonFormat.Parser parser = JsonFormat.parser();
        JsonFormat.Printer printer = JsonFormat.printer();
        String print = printer.print(person);
        System.out.println("转化对象："+print);
        int id = person.getId();
        String name = person.getName();
        String email = person.getEmail();
        System.out.println(id + "|" + name+ "|"+email );
    }
}
