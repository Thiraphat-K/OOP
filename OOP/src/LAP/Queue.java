/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAP;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
public class Queue {
    private int size = 0;
    private int[]array  = new int[0];
    private int maxNum;
    Queue(int maxNum){
        this.maxNum = maxNum;
    }
    public void enqueue(int newStudent){
        if(size < maxNum){
            int[] temp = new int[size];
            for(int i = 0;i< size;i++){
                temp[i]=this.array[i];
            }
            this.array = new int[size+1];
            for(int i = 0;i< size;i++){
                this.array[i]=temp[i];
            }
            this.array[size] = newStudent;
            this.size++;
        }
        else this.maxNum = this.maxNum*2;
    }
    public void dequeue(){
        if(size > 0){
            System.out.println("\nRemove "+array[0]+" frome queue");
            int[] temp = new int[size-1];
            for(int i = 1;i < size;i++){
                temp[i-1]=this.array[i];
            }
            this.array = new int[size-1];
            for(int i = 0;i< size-1;i++){
                this.array[i]=temp[i];
            }
            this.size--;
        }
        else System.out.println("\nQueue is emtpy now!");
    }

    public int getQueue(int i){
        return this.array[i];
    }
    public int getSize(){
        return this.size;
    }
}
