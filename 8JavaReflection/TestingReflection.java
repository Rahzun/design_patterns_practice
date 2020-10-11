import java.lang.reflect.Modifier;

public class TestingReflection {
  public static void main(String[] args) {

    Class reflectClass = UFOEnemyShip.class;

    String className = reflectClass.getName();

    System.out.print(className + "\n");

    int classModifier = reflectClass.getModifiers();

    // isAbstract, isFinal, isInterface, isPrivate, isProtected,
    // isStatic, isStrict, isSynchronized, isVolatile
    System.out.print(Modifier.isPublic(classModifier) + "\n");

    // shows any interfaces attached to the class
    Class[] interfaces = reflectClass.getInterfaces();

    Class classSuper = reflectClass.getSuperclass();

    System.out.print(classSuper.getName() + "\n");

    // for Method[], library needs to be imported
    // Method[] classMethods = reflectClass.getMethods();

    // for (Method method : classMethods) {
    //   System.out.print("Method Name: " + method.getName() + "\n");
    // }



  }

}