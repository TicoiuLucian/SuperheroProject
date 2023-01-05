package ro.itschool.controller.example;

import ro.itschool.entity.Superhero;

public class SuperheroExample {

    public static final String superHero = """
            [
              {
                "id": 1,
                "name": "Illustrious Namorita Man",
                "realName": "Cal Efornia",
                "weaknesses": [
                  {
                    "id": 1,
                    "name": "Oil",
                    "description": null,
                    "lethal": null
                  },
                  {
                    "id": 2,
                    "name": "Shrapnel",
                    "description": null,
                    "lethal": null
                  },
                  {
                    "id": 3,
                    "name": "Love",
                    "description": null,
                    "lethal": null
                  }
                ],
                "powers": [
                  {
                    "id": 1,
                    "name": "Resurrection",
                    "description": null
                  }
                ],
                "sidekick": {
                  "id": 1,
                  "name": "Captain White Queen",
                  "realName": "Easton West"
                }
              },
              {
                "id": 2,
                "name": "Doctor Bloodwraith",
                "realName": "Art Exhibit",
                "weaknesses": [
                  {
                    "id": 4,
                    "name": "Rain",
                    "description": null,
                    "lethal": null
                  }
                ],
                "powers": [
                  {
                    "id": 2,
                    "name": "Animal Attributes",
                    "description": null
                  }
                ],
                "sidekick": {
                  "id": 2,
                  "name": "Mephisto X",
                  "realName": "Di O'Bolic"
                }
              }
            ]
                        
            """;

}
