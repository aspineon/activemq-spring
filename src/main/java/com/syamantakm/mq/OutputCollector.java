package com.syamantakm.mq;

import java.util.Map;

/**
 * @author Syamantak Mukhopadhyay
 */
public class OutputCollector {
    private Map<String, String> outputMap;

    public void setOutputMap(Map<String, String> map) {
        this.outputMap = map;
    }

    public Map<String, String> getOutputMap() {
        return outputMap;
    }
}