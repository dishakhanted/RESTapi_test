
import com.example.demotrialh2.Controller.EmployeeController;
import com.example.demotrialh2.Model.Employee;
import com.example.demotrialh2.Service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest
{
    @InjectMocks
    EmployeeController employeeController;

    @Mock
    EmployeeService employeeService;

@Test
public void TestSaveEmployee() {
    //given
    when(employeeService.saveEmp(any(Employee.class))).thenReturn(1);

    //when
    Integer count = employeeController.saveEmployee(new Employee());

    //then
    Assert.assertEquals(new Integer(1),count);
    verify(employeeService,times(1)).saveEmp(any(Employee.class));

}

public void TestFindEmployee()
{
    when(employeeService.findEmployee()).thenReturn(new ArrayList<>());
    Assert.assertEquals(any(Employee.class),employeeController.findEmployee());
}


}
