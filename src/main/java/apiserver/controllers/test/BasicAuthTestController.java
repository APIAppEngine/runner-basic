package apiserver.controllers.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mnimer on 5/5/14.
 */
@Controller
@RestController
public class BasicAuthTestController
{
    @RequestMapping(value = "/test/basic-auth", method= RequestMethod.GET)
    public ResponseEntity<Map> test()
    {
        HashMap<String, Object> m = new HashMap<String, Object>();
        m.put("status", "ok");
        m.put("timestamp", new Date().getTime());
        return new ResponseEntity<Map>(m, HttpStatus.OK);
    }
}
