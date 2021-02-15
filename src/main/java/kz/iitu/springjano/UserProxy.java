package kz.iitu.springjano;

import java.util.HashMap;

public class UserProxy implements BankService{
    HashMap<Integer, Integer> passw = new HashMap<>();
private UserReal userReal = new UserReal();
    @Override
    public void checkBalance() {
userReal.checkBalance();
    }

    @Override
    public void withDraw() {
userReal.withDraw();
    }

    @Override
    public void topUp() {
userReal.topUp();
    }

    @Override
    public void checkAcc() {
userReal.checkAcc();
    }
}
