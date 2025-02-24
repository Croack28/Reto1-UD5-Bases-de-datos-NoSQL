package com.example.apartado3;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.lightcouch.Changes;
import org.lightcouch.ChangesResult;
import org.lightcouch.CouchDbClient;
import org.lightcouch.ReplicationResult;
import org.lightcouch.Response;

public class Principal {

	public static void main(String[] args) {
		
		CouchDbClient dbClient = new CouchDbClient(); 

		Foo foo = new Foo(); // Plain Java Object

		Response response = dbClient.save(foo);

		/*
		Foo foo2 = dbClient.find(Foo.class, "doc-id");

		dbClient.update(foo2);

		dbClient.remove(foo2);

		boolean b = dbClient.contains("doc-id");

		System.out.println(b);
		
		*/
	}
}
