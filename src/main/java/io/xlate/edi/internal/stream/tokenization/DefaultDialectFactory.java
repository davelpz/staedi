package io.xlate.edi.internal.stream.tokenization;

public class DefaultDialectFactory implements DialectFactory {
    private static final DialectFactory instance  = new DefaultDialectFactory();

    public static DialectFactory getInstance() {
        return instance;
    }
}
