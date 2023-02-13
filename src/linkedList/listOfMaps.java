package linkedList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class listOfMaps {




        // email  password first last
        //halodkmn1@gmail.com	f98aa3ec36a5b5086c1a93f689259060	Halil	UPDATEDNAME
        //zenaida.cole@gmail.com	ac29c1f0ff650e542aaa174dfe615ee3	Lakesha	Hackett
        //murray.auer@gmail.com	64bcde7cc0547b6e0347756960b424d5	Florencia	Gusikowski
        //dulcie.kunze@hotmail.com	4db64cbda8f8239d9cf5473ae046cbc8	Rosetta	Kulas
        //johna.marks@yahoo.com	239db97d78a99c656c809f90d60de077	Cody	Sanford


        public static void main(String[] args) {


            Object[][] info = {
                    {"email", "password", "first", "last", "phone"},
                    {"halodkmn1@gmail.com", "f98aa3ec36a5b5086c1a93f689259060", "Halil", "Dikmak", 253432614},
                    {"hzenaida.cole@gmail.com", "ac29c1f0ff650e542aaa174dfe615ee3", "Lakesha", "Hackett", 253432614},
                    {"murray.auer@gmail.com", "4db64cbda8f8239d9cf5473ae046cbc8", "Florencia", "Gusikowski", 253432614},
            };

            // List of Maps

            List<Map<String, Object>> listOfMaps = new ArrayList<>();


            Object[] keys = info[0];

            for (int i = 1; i < info.length; i++) {

                Map<String, Object> row = new LinkedHashMap<>();

                for (int j = 0; j < info[i].length; j++) {
                    row.put((String) keys[j], info[i][j]);
                }
                listOfMaps.add(row);

            }

            for (Map<String, Object> row : listOfMaps) {

                System.out.println(row);
//            System.out.println(row.get("email"));
            }

            System.out.println(listOfMaps.get(1).get("first"));

            String first = (String) (listOfMaps.get(1).get("first"));

            System.out.println(first.toUpperCase());
        }
    }




