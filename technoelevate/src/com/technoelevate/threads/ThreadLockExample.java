package com.technoelevate.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLockExample {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                performLockedOperation("Thread 1");
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                performLockedOperation("Thread 2");
            }
        };

        thread1.start();
        thread2.start();
    }

    private static void performLockedOperation(String threadName) {
        lock.lock();
        try {
            System.out.println(threadName + " has acquired the lock and is performing the critical section.");
            // Perform critical section operations
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(threadName + " has completed the critical section and released the lock.");
            lock.unlock();
        }
    }
}

