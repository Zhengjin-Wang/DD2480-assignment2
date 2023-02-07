package com.example.assignment2.utils;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;

public class CloneRepository {


    public static void cloneRepository(String repositoryURL, String localPath) {
        try {

            Git.cloneRepository()
                    .setURI(repositoryURL)
                    .setDirectory(new File(localPath))
//                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider("qq1054129023", "wzj15376707295"))
                    .call();
            System.out.println("Repository cloned successfully to " + localPath);
        } catch (GitAPIException e) {
            System.out.println("Error cloning repository: " + e.getMessage());
        }
    }
}
