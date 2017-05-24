package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DecisionTableTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-dtables");

            // go !
        	coffeeCost cost = new coffeeCost(30,1,1,1);
            kSession.insert(cost);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    /**
     * 20-50
     * @author zxy
     *
     */
    public static class coffeeCost {
        int age;
        int isCard;//  1：isCard
    	int isBir;// 1：isBir
        int type;//0 : A 1：B
        int cost;
        
    	public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public coffeeCost(int age, int isCard, int isBir, int type) {
    		super();
    		this.age = age;
    		this.isCard = isCard;
    		this.isBir = isBir;
    		this.type = type;
    	}
    	public int getIsBir() {
    		return isBir;
    	}
    	public void setIsBir(int isBir) {
    		this.isBir = isBir;
    	}
    	public int getAge() {
    		return age;
    	}
    	public void setAge(int age) {
    		this.age = age;
    	}
    	public int getIsCard() {
    		return isCard;
    	}
    	public void setIsCard(int isCard) {
    		this.isCard = isCard;
    	}
    	public int getType() {
    		return type;
    	}
    	public void setType(int type) {
    		this.type = type;
    	}

    }

}
