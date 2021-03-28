# Java

## Github

Change to desktop

```shell
cd Desktop
```

Clone the code

```shell
git clone https://github.com/26selinaw/Java.git
cd Java
```

Check status

```shell
git status
```

Add new files, for example

```shell
git add README.md
```

Commit

```shell
git commit -m "some message you want to add"
```

Push the commit to the Github

```shell
git push origin master
```

Check history

```shell
git log
```

## Useful commands

1. pwd check which folder
2. cd move to different foler
3. ls ls -all list of all the items in a folder
4. rm remove

## Java Opening
public class Graphic {
    public static void main (String args[]) {
    
    }
}

3/27

Add entry point

```shell
add breakpoint
```
Java Lists

Import lists package

```shell
import java.util.List;
import java.util.ArrayList;
```
Java List Format

```shell
NameOfList <ListType> name = new NameOfList <ListType> ();
name.add ("listcontent");

* for loop
for (ListType : name){
    System.out.printf ("Repeated Content %s /n", name);
}
```

Python List Format

```shell
ListName = ["ListContent"]
print(ListName)
```
3/28

Java Graphics Importation

```shell
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.Applet;
```

