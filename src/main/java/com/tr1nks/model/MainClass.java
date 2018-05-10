package com.tr1nks.model;

import com.tr1nks.interfaces.HtmlWindowMember;
import com.tr1nks.model.members.MyTest;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 * Created by Tr1nks on 14.06.2017.
 */
/*http://o7planning.org/en/11151/javafx-webview-and-webengine-tutorial*/
public class MainClass extends Application {
    private WebView webView;
    private WebEngine webEngine;
    private JSObject windowObject;

    public static void main(String[] args) {
//todo find and call realization of ArgsProcessor
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        this.webView = new WebView();
        this.webEngine = webView.getEngine();
        this.windowObject = (JSObject) this.webEngine.executeScript("window");


        this.webEngine.load(this.getClass().getResource("/html/html/test.html").toExternalForm());
        HtmlWindowMember m = new MyTest();
        windowObject.setMember(m.getName(), m);


        primaryStage.setScene(new Scene(new BorderPane(webView)));
        primaryStage.show();
    }
}
