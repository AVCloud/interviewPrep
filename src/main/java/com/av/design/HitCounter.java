package com.av.design;

/**
 * Created by Anuj on 2/6/2018.
    get hits in last one min.This handles case for fixed time window
 */
public class HitCounter {

    int noOfHits;
    int lastTimeStamp;

    public void hit(int timestamp){
        if(timestamp-lastTimeStamp>1){
            noOfHits = 1;
            lastTimeStamp = timestamp;
        }else{
            noOfHits++;
        }
    }

    public int getHits(){
        return noOfHits;
    }
}
