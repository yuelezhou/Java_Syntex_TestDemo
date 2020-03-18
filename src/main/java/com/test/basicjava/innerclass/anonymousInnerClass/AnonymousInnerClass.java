package com.test.basicjava.innerclass.anonymousInnerClass;

public class AnonymousInnerClass {
    public void sayAnnoInnerClass(){
        Worker worker = new Worker("Bob") {
            @Override
            public int workTime() {
                return 8;
            }
        };
        System.out.println(worker.getName()+",workTime:"+worker.workTime());
    }


    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.sayAnnoInnerClass();
    }
}
