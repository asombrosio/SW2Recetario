/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.saxonica.xqj.SaxonXQDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

/**
 *
 * @author DarVVolf
 */
public class XQuery {
    
    protected void Query1(){
    
     try {
          
            File queryFile = new File("./files/XQuery/Query_2.xqy"); 

            XQDataSource xqjd = new SaxonXQDataSource();
            XQConnection xqjc = xqjd.getConnection();
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(queryFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(XQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            XQPreparedExpression exp = xqjc.prepareExpression(inputStream);
            XQResultSequence result = exp.executeQuery();
            

            while (result.next()) {
                
                System.out.println(result.getItemAsString(null));
            }
            result.close();
            exp.close();
            xqjc.close();

        } catch (XQException ex) {
            Logger.getLogger(XQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
