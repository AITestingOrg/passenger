import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When GET request api/v1/passengers/{ID} should return list of all passengers")
            request {
                method 'GET'
                url 'api/v1/passenger/{id}'
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