package com.chendi.training;

public interface Compare<A> {
    /**
     * return positive value means object is larger than argument instance
     * @param
     * @return
     */
    public int compareWith(A a,A b);

    public void setSpeedLimit(int milePerhr);
}
