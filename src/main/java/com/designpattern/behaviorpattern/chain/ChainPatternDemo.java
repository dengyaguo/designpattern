package com.designpattern.behaviorpattern.chain;
/**
 * @ClassName:      ChainPatternDemo
 * @Description:    责任链模式 测试
 * @Author:         布衣
 * @Version:        1.0
 *
 * FilterChain  常见的filter链
*/
public class ChainPatternDemo {


    private static  AbstractLogger getChainLoggers(){
        InfoLogger infoLogger = new InfoLogger(1);
        DebugLogger debugLogger = new DebugLogger(2);
        ErrorLogger errorLogger = new ErrorLogger(3);
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return  infoLogger;
    }

    public static void main(String[] args) {

        AbstractLogger chainLoggers = getChainLoggers();
        chainLoggers.logMessage(3,"NullPointer Exception");


    }
}
