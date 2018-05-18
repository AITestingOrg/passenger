import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When a DELETE request api/v1/passengers/{ID} should return Status 200")
            request {
                method 'DELETE'
                url 'api/v1/passenger/1'
                headers {
                    contentType(applicationJson())
                }
            }
            response {
                status 200
            }
        }
]
