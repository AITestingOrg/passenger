import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When a PUT request api/v1/passengers/{ID} should return Status 200")
            request {
                method 'PUT'
                url 'api/v1/passenger'
                headers {
                    contentType(applicationJson())
                }
                body($(consumer(file("passenger.json"))))
            }
            response {
                status 200
            }
        }
]
