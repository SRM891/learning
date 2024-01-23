package com.NewAPITest.learning.controller;

import com.NewAPITest.learning.model.CloudVendor;
import com.NewAPITest.learning.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class CloudVendorController {
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    CloudVendorService cloudVendorService;
    @GetMapping("{Id}")
    public CloudVendor getVendorDetails(@PathVariable("Id") String Id){
        return cloudVendorService.getCloudVendor(Id);
    }

    @GetMapping
    public List<CloudVendor> getAllVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String createVendor(@RequestBody CloudVendor vendor){
        cloudVendorService.createCloudVendor(vendor);
        return "Created successfully";
    }
    @PutMapping
    public String updateVendor(@RequestBody CloudVendor vendor){
        cloudVendorService.updateCloudVendor(vendor);
        return "updated successfully";
    }
    @DeleteMapping("{Id}")
    public String deleteVendor(String Id){
        cloudVendorService.deleteCloudVendor(Id);
        return "Deleted successfully";
    }
}
