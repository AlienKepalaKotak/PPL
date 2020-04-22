/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class integrationTest {
    public static void main(String[] args) {
        SequentialSearch ss = new SequentialSearch();
        assertEquals(1,1,ss.SequentialSearch(81));
    }
}

//Test Case data tidak dapat disimpan dilakukan dengan mematikan koneksi database sehingga pada source code ini tidak ada perbedaannya