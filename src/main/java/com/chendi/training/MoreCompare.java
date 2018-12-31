package com.chendi.training;

public interface MoreCompare<A,B> extends Compare<A,B> {
    <M extends A> M save (M entity);
}
