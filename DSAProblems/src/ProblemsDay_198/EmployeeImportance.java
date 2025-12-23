package ProblemsDay_198;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
public class EmployeeImportance {
//https://leetcode.com/problems/employee-importance/?envType=problem-list-v2&envId=array
    private Map<Integer, Employee> empMap = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        // Build lookup map
        for (Employee e : employees) {
            empMap.put(e.id, e);
        }
        return dfs(id);
    }

    private int dfs(int empId) {
        Employee emp = empMap.get(empId);
        int total = emp.importance; // Current employee's importance
        for (int subId : emp.subordinates) {
            total += dfs(subId); // Add importance from subordinates
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
