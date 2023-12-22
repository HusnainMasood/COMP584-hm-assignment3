package backend;
import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private List<Data> dataset; // Simulated dataset

    // Endpoint to get paginated data with filters
    @GetMapping
    public ResponseEntity<List<Data>> getFilteredData(
            @RequestParam(required = false) String filterColumn1,
            @RequestParam(required = false) String filterColumn2,
            @RequestParam(required = false) String filterColumn3,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "25") int pageSize
    ) {
        // Apply filters (you can modify this based on your actual filtering logic)
        List<Data> filteredData = dataset.stream()
                .filter(data -> filterColumn1 == null || data.getColumn1().contains(filterColumn1))
                .filter(data -> filterColumn2 == null || data.getColumn2().contains(filterColumn2))
                .filter(data -> filterColumn3 == null || data.getColumn3().contains(filterColumn3))
                .skip(page * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

        return ResponseEntity.ok(filteredData);
    }

    // Other methods to initialize data and handle dataset operations
}

