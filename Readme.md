gRPC API Implementation
========================

************ Unary ******************
Request sent from Client- Unary - FlightId=100
Response from Server- Unary - allocation=201, result 


************ Client Streaming ******************
Request sent from Client- ClientStreaming - FlightId=100
Request sent from Client- ClientStreaming - FlightId=200
Request sent from Client- ClientStreaming - FlightId=300
Response from Server- ClientStreaming1000Result=100 Receieved, 200 Receieved, 300 Receieved, 
Response from Server-Completed 



************ Server Streaming ******************
Request sent from Client- ServerStreaming - FlightId=560
Response Received from Server- ServerStreaming: Allocation=0, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=1, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=2, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=3, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=4, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=5, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=6, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=7, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=8, Result=Server Stream
Response Received from Server- ServerStreaming: Allocation=9, Result=Server Stream


************ Bidrectional Streaming ******************
Request sent from Client- Bidirectional Streaming - FlightId=120
Request sent from Client- Bidirectional Streaming - FlightId=213
Request sent from Client- Bidirectional Streaming - FlightId=234
Request sent from Client- Bidirectional Streaming - FlightId=23
Request sent from Client- Bidirectional Streaming - FlightId=23423
Request sent from Client- Bidirectional Streaming - FlightId=234234
Request sent from Client- Bidirectional Streaming - FlightId=23423
Request sent from Client- Bidirectional Streaming - FlightId=234
Response received from the server:  BidirectionalResult of Flight Id=120, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=213, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=234, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=23, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=23423, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=234234, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=23423, Allocation=20
Response received from the server:  BidirectionalResult of Flight Id=234, Allocation=20
