package utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    public static String createEmployeePayload() {
        String createEmployeePayload = "{\n" +
                "    \"emp_firstname\":\"Lka\",\n" +
                "        \"emp_lastname\":\"Modric\",\n" +
                "    \"emp_middle_name\":\"PUSS \",\n" +
                "        \"emp_gender\":\"M\",\n" +
                "        \"emp_birthday\":\"1989-07-22\",\n" +
                "        \"emp_status\":\"normal\",\n" +
                "        \"emp_job_title\":\"FOOTBALLER\"\n" +

                "}";
        return createEmployeePayload;
    }

    public static String createDynamicEmployeePayloadJson(String firstname, String lastname, String middlename, String gender, String birthday, String status, String jobtitlle) {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", birthday);
        obj.put("emp_status", status);
        obj.put("emp_job_title", jobtitlle);
        return obj.toString();

    }

    public static String updateEmployeePayload() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "firstname");
        obj.put("emp_lastname", "lastname");
        obj.put("emp_middle_name", "middlename");
        obj.put("emp_gender", "gender");
        obj.put("emp_birthday", "2022-08-99");
        obj.put("emp_status", "status");
        obj.put("emp_job_title", "jobtitlle");
        return obj.toString();

    }

}
