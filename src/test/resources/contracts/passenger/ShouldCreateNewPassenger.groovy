import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When a POST request api/v1/passengers should return Status 200")
            request {
                method 'POST'
                url 'api/v1/passenger'
                headers {
                    contextType(applicationJson())
                }
                body(
                        //serialized JSON
                )
            }
            response {
                status 200
                body('''[]''')
                headers{
                    contentType(applicationJson())
                }
            }
        }
]