package passenger

import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description("When GET request api/v1/passengers/list should return list of all passengers")
            request {
                method 'GET'
                url 'api/v1/passenger/list'
            }
            response {
                status 200
            }
        }
]
