package passenger

import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When a PUT request api/v1/passengers/{ID} should return Status 200")
            request {
                method 'PUT'
                url 'api/v1/passenger/1'
                headers {
                    contentType(applicationJson())
                }
                body(

                            "firstName" : "Jon",
                            "lastName" : "Doe",
                            "email" : "jondoe@yahoo.com",
                            "streetAddress" : "6817 taft st",
                            "city" : "Hollywood",
                            "state" : "FL",
                            "zip" : "33024",
                            "phoneNumber" : "1800411pain"

                )
            }
            response {
                status 200
                }
            }
]