package com.windrift.headfirst.stateAndStrategy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says 'Hey'";
	}
	
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoImpl();
			Naming.bind("RemoteHello", service);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
