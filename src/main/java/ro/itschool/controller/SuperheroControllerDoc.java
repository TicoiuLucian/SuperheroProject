package ro.itschool.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import ro.itschool.controller.example.SuperheroExample;
import ro.itschool.entity.Superhero;

import java.util.List;

public interface SuperheroControllerDoc {

    @Operation(summary = "Get all superheroes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - request has succeeded",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = String.class),
                            examples = {@ExampleObject(
                                    name = "200-OK",
                                    value = SuperheroExample.superHero)}),

                    }),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error",
//                    content = {@Content(mediaType = "application/json",
//                            schema = @Schema(implementation = LabelList.class),
//                            examples = {@ExampleObject(
//                                    name = "500-Internal Server Error",
//                                    value = "Internal Server Error")})
//                    })
    })
    @GetMapping
    List<Superhero> getAllSuperheroes();
}
