package com.example.accessingmongodbdatarest;

import com.mongodb.client.*;
import org.bson.Document;

import com.mongodb.client.*;
import org.bson.Document;

public class LeerDesdeJavaMongoDB {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
) {
            MongoDatabase database = mongoClient.getDatabase("personas");
            MongoCollection<Document> collection = database.getCollection("personas");

            for (Document doc : collection.find()) {
                System.out.println("Nombre: " + doc.getString("nombre"));
                System.out.println("Apellidos: " + doc.getString("apellidos"));
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
