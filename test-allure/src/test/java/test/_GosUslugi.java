package test;

import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import ru.yandex.qatools.allure.annotations.*;
import seleniumCreatorLib.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class _GosUslugi{
private static Boolean f=true;
private static Executor TestClass=new Executor();
@After
public void exit(){
if(f){
            TestClass.exit();
        }
}

@AfterClass
    public static void exit1() throws IOException {
       if (new File("environment.xml").exists()) {
            new File("target/allure-results").mkdirs();
            Files.copy(Paths.get("environment.xml"), Paths.get("target/allure-results/environment.xml"), new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            });
        }
    }
@Attachment
public String Attach() {
return TestClass.returnError();
}
@Features("GosUslugi.sff")
@Stories({"firefox(maximize)"})
@Test
@Title(value = "Проверка версии для слабовидящих")
public void firefox_2_Проверкаверсиидляслабовидящих20() throws InterruptedException, IOException{
System.out.println();System.out.println("  3. Проверка версии для слабовидящих: firefox");
if(!f||TestClass.runBrowser("firefox",new String[][]{},5,"",new int[]{0,0})){
f=true;
go20();search21();click22();search23();click24();pause25();compare26();}
else{
System.out.println("    false");
}}
@Attachment(value = "screen_error", type = "image/png")
public byte[] Screen0() throws IOException {
return TestClass.screenAllure();
}
@Attachment(value = "screen_error", type = "image/png")
public byte[] Screen1() throws IOException {
return TestClass.screenAllure();
}
@Attachment(value = "screen_error", type = "image/png")
public byte[] Screen2() throws IOException {
return TestClass.screenAllure();
}
@Step(value = "Перейти на сайт ГосУслуги")
public void go20() throws IOException{
System.out.print("      1) Перейти на сайт ГосУслуги");
boolean flag=TestClass.goUrl("https://www.gosuslugi.ru");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Найти элемент \"Подтвердить местоположение\"")
public void search21() throws IOException{
System.out.print("      2) Найти элемент \"Подтвердить местоположение\"");
boolean flag=TestClass.search("//a[@name='currentAction']","xpath");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Подтверждение определения местоположения")
public void click22() throws IOException{
System.out.print("      3) Подтверждение определения местоположения");
boolean flag=TestClass.clickButton("//a[@name='currentAction']","xpath");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Найти элемент \"Версия для слабовидящих\"")
public void search23() throws IOException{
System.out.print("      4) Найти элемент \"Версия для слабовидящих\"");
boolean flag=TestClass.search("special-version-link","id");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Перейти на старицу \"Версия для слабовидящих\"")
public void click24() throws IOException{
System.out.print("      5) Перейти на старицу \"Версия для слабовидящих\"");
boolean flag=TestClass.clickButton("special-version-link","id");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Пауза 1 с")
public void pause25() throws InterruptedException, IOException{
System.out.print("      6) Пауза 1 с");
boolean flag=TestClass.pause(1000);
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Step(value = "Проверка, что открылась версия для слабовидящих")
public void compare26() throws IOException{
System.out.print("      7) Проверка, что открылась версия для слабовидящих");
boolean flag=TestClass.compare("Электронные услуги, доступные в версии для слабовидящих","//div[@class='content']/h1","xpath");
System.out.println("    "+String.valueOf(flag));
if(!flag){
 Attach();
Screen2(); Assert.fail(TestClass.returnErrorMessage());}
}
@Attachment(value = "screen_error", type = "image/png")
public byte[] Screen3() throws IOException {
return TestClass.screenAllure();
}
@Attachment(value = "screen_error", type = "image/png")
public byte[] Screen4() throws IOException {
return TestClass.screenAllure();
}

}
	