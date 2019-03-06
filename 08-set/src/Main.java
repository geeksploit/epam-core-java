package lesson8;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
   Set<String> a = new HashSet<>();
   a.add("A");
   a.add("B");
   a.add("C");
   a.add("Z");
        
   Set<String> b = new HashSet<>();
   b.add("C");
   b.add("D");
   b.add("E");
   b.add("Z");
   
   System.out.println("    a: " + a);
   System.out.println("    b: " + b);
   System.out.println("-----------");
   System.out.println("cross: " + cross(a, b));
   System.out.println("a - b: " + sub(a, b));
   System.out.println("b - a: " + sub(b, a));
   System.out.println("union: " + union(a, b));
   System.out.println("  xor: " + xor(a, b));
  }
  
  private static Set<String> cross(Set<String> a, Set<String> b) {
      Set<String> out = new HashSet<>();
      Set<String> shorter = a.size() < b.size() ? a : b;
      Set<String> longer = a.size() >= b.size() ? a : b;
      
      Iterator<String> iterator = shorter.iterator();
      while (iterator.hasNext()) {
          String next = iterator.next();
          if (longer.contains(next)) {
              out.add(next);
          }
      }
      return out;
  }
  
  private static Set<String> sub(Set<String> a, Set<String> b) {
      Set<String> out = new HashSet<>(a);
      
      Iterator<String> iterator = b.iterator();
      while(iterator.hasNext()) {
          out.remove(iterator.next());
      }
      
      return out;
  }
  
  private static Set<String> union(Set<String> a, Set<String> b) {
      Set<String> out = new HashSet<>();
      
      Iterator<String> iterator = a.iterator();
      while(iterator.hasNext()) {
          out.add(iterator.next());
      }
      
      iterator = b.iterator();
      while(iterator.hasNext()) {
          out.add(iterator.next());
      }
      
      return out;
  }
  
  private static Set<String> xor(Set<String> a, Set<String> b) {
      return union(sub(a, b), sub(b, a));
  }
}
