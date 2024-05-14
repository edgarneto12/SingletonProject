//package org.singletonProject;
//
//public class TestandoSingleton {
//
//    private static volatile TestandoSingleton instance;
//
//    private TestandoSingleton(){}
//
//    public static TestandoSingleton getInstance() {
//        if (instance == null) {
//            synchronized (TestandoSingleton.class) {
//                if (instance == null) {
//                    instance = new TestandoSingleton();
//                }
//            }
//        }
//        return instance;
//    }
//}
