import org.springframework.cloud.contract.spec.Contract

Contract.make {

	request {
		method 'GET'
		url value(consumer(regex('/greeting/[0-9]{5}')), producer('/greeting/12345'))
	}

	response {
		status 200
		body([
				message: 'Hi Kaburagi',
				name: 'Takayuki',
				age: 29
		])
		headers {
			header('Content-Type': value(
					producer(regex('application/json.*')),
					consumer('application/json')
			))
		}
	}
}