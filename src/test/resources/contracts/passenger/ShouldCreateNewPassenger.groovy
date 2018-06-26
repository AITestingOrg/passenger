import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a POST request api/v1/passengers should return Status 201")
    request {
        method 'POST'
        url 'api/v1/passenger'
        headers {
            contentType(applicationJson())
        }
        body( $(consumer(file("passengerDto.json"))))
    }
    response {
        status 201
        body("""
                {
                            "id" : 0,
                            "firstName" : "Jon",
                            "lastName" : "Doe",
                            "email" : "jondoe@yahoo.com",
                            "streetAddress" : "6817 taft st",
                            "city" : "Hollywood",
                            "state" : "FL",
                            "zip" : "33024",
                            "phoneNumber" : "1800411pain"
                 }
                """)
        headers{
            contentType(applicationJson())
        }
    }
}
