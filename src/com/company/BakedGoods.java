package com.company;

public class BakedGoods {
    public boolean freshDaily;
    public boolean isGlutenFree;

    public void setFreshDaily(boolean freshDaily) {
        this.freshDaily = freshDaily;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public boolean getFreshDaily() {
        return freshDaily;
    }

    public boolean getGlutenFree() {
        return isGlutenFree;
    }

    public BakedGoods(boolean freshDaily, boolean isGlutenFree){
        this.freshDaily = true;
        this.isGlutenFree = true;
    }

    void Print(){
        System.out.println("Is this made fresh daily?" + freshDaily);
        System.out.println("Is this gluten free?" + isGlutenFree);

    }
}
