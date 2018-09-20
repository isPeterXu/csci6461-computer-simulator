/**
 * MEMORY
 */
package edu.gw.csci.simulator.memory;

import java.util.BitSet;

public class Memory {
    /**
     * CONSTANTS
     */
    private static final int DEFAULT_MEMORY_SIZE = 2048,
            DEFAULT_WORD_SIZE = 16;

    /**
     * MEMORY
     */
    private final int size, wordSize;
    private BitSet[] memory;

    /**
     *
     * @param size
     * @param wordSize
     */
    public Memory(int size, int wordSize){
        this.size = size;
        this.wordSize = wordSize;
    }

    /**
     * CONSTRUCTOR
     */
    public Memory(){
        this.size = DEFAULT_MEMORY_SIZE;
        this.wordSize = DEFAULT_WORD_SIZE;
    }

    /**
     * INITIALIZE MEMORY
     */
    public void initialize(){
        this.memory = new BitSet[this.size];
        for(int i =0; i < this.size; i++){
            this.memory[i] = new BitSet(this.wordSize);
        }
    }
}