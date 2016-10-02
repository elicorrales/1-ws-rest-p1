package com.eli.calc.shape.service.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eli.calc.shape.service.ws.parms.QueueCalculationParms;
import com.eli.calc.shape.service.ws.types.CalculatedResultsResponse;
import com.eli.calc.shape.service.ws.types.PendingRequestsResponse;
import com.eli.calc.shape.service.ws.types.RunPendingRequestsResponse;
import com.eli.calc.shape.service.ws.types.StatusResponse;

@Produces(MediaType.APPLICATION_XML)
public interface ShapeCalculatorWebService {

	StatusResponse deletePendingRequests();
	
	StatusResponse deleteResults();
	
    StatusResponse queueCalculation(QueueCalculationParms parameters);

    @GET
    @Path("/pending")
	PendingRequestsResponse getPendingRequests();
	
	CalculatedResultsResponse getCalculatedResults();
	
	RunPendingRequestsResponse runPendingRequestsStopOnError();

	RunPendingRequestsResponse runPendingRequestsNoStopOnError();
	
}