package com.nio.pb;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.openjdk.jol.info.GraphLayout;

public class Test {


    /**
     * Tag+Length(��ѡ)+Value
     * 300
     * 0000 0000 0000 0000 0000 0001 0010 1100
     * ��ȡ��Ч�ֽ�ǰ7λ����������ֽڻ�����˼�����ȡ�����λΪ1
     * 1010 1100 0000 0010
     * -84 2
     * @param args
     * @throws InvalidProtocolBufferException
     */
    public static void main(String[] args) throws InvalidProtocolBufferException {
        PersonProto.Person.Builder builder = PersonProto.Person.newBuilder();
        PersonProto.Person person = builder.setEmail("email").setId(300).setName("name").build();
        ByteString bytes = person.toByteString();
        StringBuffer stringBuffer = new StringBuffer();
        bytes.forEach(aByte -> {
            String s = aByte.byteValue() + "";
            stringBuffer.append(s).append(" ");
        });
        System.out.println(stringBuffer.toString());//10 4 110 97 109 101 16 -84 2 26 5 101 109 97 105 108
        System.out.println("pb-java对象内存："+bytes.size());
        Person person2 = new Person();
        person2.setId(300);
        person2.setName("name");
        person2.setEmail("email");
        System.out.println("原生-java对象内存：" + GraphLayout.parseInstance(person2).totalSize());
    }
}
