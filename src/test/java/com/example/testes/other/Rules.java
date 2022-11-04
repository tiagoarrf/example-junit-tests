package com.example.testes.other;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class Rules {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testTemporaryFolder() throws IOException {
        File arquivoCriado = tempFolder.newFile("arquivo.txt");

        assertTrue(arquivoCriado.isFile());
        assertEquals(tempFolder.getRoot(), arquivoCriado.getParentFile());
    }
    
    
}
