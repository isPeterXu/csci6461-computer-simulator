/**
 * REGISTER
 */
package edu.gw.csci.simulator.registers;

import java.util.BitSet;

public class Register {
    /**
     * VARIABLES
     */
    private final RegisterType registerType;
    private BitSet data;

    /**
     * INSTANTIATE REGISGTER
     * @param registerType
     */
    public Register(RegisterType registerType){
        if(registerType.getSize() > 64){
            throw new IllegalArgumentException("Can't instantiate register size larger than 64 bits");
        }
        this.registerType = registerType;
    }

    /**
     * INITIATE REGISTER
     */
    public void initialize(){
        data = new BitSet(registerType.getSize());
    }

    /**
     *
     * @return
     */
    public RegisterType getRegisterType() {
        return registerType;
    }

    /**
     *
     * @return
     */
    public BitSet getData() {
        return data;
    }

    /**
     *
     * @return
     */
    public int getSize(){
        return registerType.getSize();
    }

    /**
     *
     * @return
     */
    public String getName(){
        return registerType.toString();
    }

    /**
     *
     * @return
     */
    public String getDescription(){
        return registerType.getDescription();
    }
}
