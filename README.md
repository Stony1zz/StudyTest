# StudyTest
##Java*Head First*的笔记
###战舰世界的笔记
####1.Integer.parseInt("3");
 > Integer：是JAVA的内建类。 
 > ParseInt:Integer的一个方法，能够将String解析成int采用String的参数该语句的功能是将String转化成为int
 
####2.for(int cell: locationCells ){}
 > int cell:声明出带有数组元素的变量，在循环的每次循环中，此变量的值都会带有不同的数组元素，知道跳出循环为止
 > locationCells:要被诸葛执行过的数组，每循环一次数组的下一个元素都赋给变量“cell”；
 
####3.numOfHits++
####4.break;

```java
package FirstDemo;  
public class No5 {
		 public static void main(String[] args){
			 SimpleDotCom dot = new SimpleDotCom();
			 int [] locations={2,3,4};
			 dot.setLocationCells(locations);
			 String userGuess = "2";
			 @SuppressWarnings("unused")
			String result = dot . checkYourself(userGuess);
		 }

}
class SimpleDotCom{
	int [] locationCells;
	int numOfHits = 0;
	public void setLocationCells(int [] locs){
		locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell:locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == 
				locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
```

###ArrayList:
####1.add(Object elem)
向list中加入对象参数
####2.remove（int index）
在索引参数中移除对象
####3.contains(Object elem)
如果和对象参数匹配返回true
####4.isEmpty()
如果list中没有元素返回true
####5.indexOf(Object elem)
返回对象参数的索引或-1
####6.size()
返回list中元素的一个数、
####7.get(int index)
返回当前索引参数的对象
##继承与多态
###继承
继承是以一种普遍语法的实现在C++中同样有这样的应用。
------
继承在这里的理解是为了方便程序的多元调用已经实现面对对象编写程序的基本方法：
```java
public class Salary {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
 
        //用继承，重写方法，都是调用的wages()方法
        Person personManager = new Manager();
        System.out.println("这个人的工资是："+personManager.wages());
        Person personEngineer = new Engineer();
        System.out.println("这个人的工资是："+personEngineer.wages());
        Person personWorker = new Worker();
        System.out.println("这个人的工资是："+personWorker.wages());
    }
 
}
 
//人类
class Person {
    public String wages(){
        return "";
    }
}
//经理类
class Manager extends Person{
    public String wages(){
        return "5000/月";
    }
}
//工程师类
class  Engineer extends Person{
    public String wages(){
        return "3000/月";
    }
}
//工人类
class Worker extends Person{
    public String wages(){
        return "2000/月";
    }
}

```
.在上述的例子中，Manager，Engineer，Worker继承了Person的方法继承在这里体现的是将父类的Public和Protect的板块进行继承是指拥有父类的模块功能包括对象以及方法，这样的好处是在我们编写多个对象当重复使用一种变量或者方法的时候可以不用重复编写，提高编程的效率同时在继承以后我们还可以利用覆盖的方法来自定义子类函数的实现。在但覆盖的时候注意不能降低方法或者参数的存取权限级别，举个例子就是不可以private转化为public。
####重载（overload）
>重载是一种C++中常见的方法
>为了实现对于一种方法的多类参数实行但是在使用的过程中要注意以下几点：
1.返回类型可以不同.   
>你可以任意的改变重在方法的返回类型，只要所有的覆盖使用不同的参数即可。
2.不能只改变返回类型 
>如果只有返回类型不同，但是参数一样，这是不允许的。编译器不会让这样的事情过关。就算是重载，也要让返回类型是父类版返回类型的子类。重载的条件是要使用不同的参数，此时返回类型可以自由地定义     
3.可以更改存储权限          
>你可以任意地设定overload版method的存取权限。

```java
public class Overloads{
 String uniqueID;
 public int addNums(int a , int b ){
 	return a+b;
	}
public double addNums(double a , double b ){
 	return a+b;
	}
public void setUniqueID(String theID){
	uniqueID = theID;
}
public void setUniqueID(int ssNumber){
	String numString = ""+ssNumber;
	setUniquyeID(numString);
}
}
