/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Counter {
    
    private int value;
    private boolean check; 
    
    public Counter(int startingValue, boolean check){
    this.value = startingValue;
    this.check = check;
    }
    public Counter(int startingValue){
    this(startingValue,false);
    }
    public Counter(boolean check){
    this(0,true);
    }
    public Counter(){
    this(0,false);
    }
    
    public int value(){
    return this.value;
    }
    public void increase(){ //increases the value of the counter by one
    this.value++;
    }
    
    public void decrease(){ //decreases the value of the counter by one with zero check option
        if (check == false) {
            this.value--;
        }
        if (check == true && this.value == 0) {
            this.value = 0;
        }
        if (check == true && this.value > 0) {
            this.value--;
            if (this.value < 0) {
                this.value = 0;
            }
        }
    }
    
    public void increase(int increaseAmount){
    if (increaseAmount > 0)
        this.value+=increaseAmount;
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.value -= decreaseAmount;
            }
            if (check == true && this.value == 0) {
                this.value = 0;
            }
            if (check == true && this.value > 0) {
                this.value -= decreaseAmount;
                if (this.value < 0) {
                    this.value = 0;
                }
            }
        }
    }
    
}
