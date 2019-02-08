package it.polimi.dagsymb;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoSerializable;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.Serializable;

public class LouvainData implements KryoSerializable, Serializable {

    Long community;
    Long communitySigmaTot;
    Long internalWeight;
    Long nodeWeight;
    Boolean changed;

    public LouvainData(Long community, Long communitySigmaTot, Long internalWeight, Long nodeWeight, Boolean changed){
        this.community = community;
        this.communitySigmaTot = communitySigmaTot;
        this.internalWeight = internalWeight;
        this.nodeWeight = nodeWeight;
        this.changed = false;
    }

    public LouvainData(){
        this(-1L, 0L, 0L, 0L, false);
    }

    public String toString(){
        return "{community:"+community+",communitySigmaTot:"+communitySigmaTot+",internalWeight:"+internalWeight+",nodeWeight:"+nodeWeight+"}";
    }

    public void write(Kryo kyro, Output output) {
        kyro.writeObject(output, this.community);
        kyro.writeObject(output, this.communitySigmaTot);
        kyro.writeObject(output, this.internalWeight);
        kyro.writeObject(output, this.nodeWeight);
        kyro.writeObject(output, this.changed);
    }

    public void read(Kryo kyro, Input input) {
        this.community = kyro.readObject(input, Long.class);
        this.communitySigmaTot = kyro.readObject(input, Long.class);
        this.internalWeight = kyro.readObject(input, Long.class);
        this.nodeWeight = kyro.readObject(input, Long.class);
        this.changed = kyro.readObject(input, Boolean.class);
    }

    @Override
    public boolean equals(Object data){
        return true;
    }



}







