package passenger

import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When GET request api/v1/passengers should return list of all passengers")
            request {
                method 'GET'
                url 'api/v1/passenger'
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
