async function filterBusiness() 
{
    const filterCrit = document.getElementById('filterInput').value;
    const pageNumber = 1;
    const pageSize = 25;

    const rsp = await fetch('/business?businessID=${businessID}&name=${name}&address=${address}&city=${city}&state=${state}&postal=${postal}&star=${star}&review=${review}&open=${open}&ctg=${ctg}&page=${page}&pageSize=${pageSize}');
    const data = await rsp.json();

    const businessListDiv = document.getElementById('businessList');
    businessListDiv.innerHTML = '';

    data.forEach(business => {
        const businessDiv = document.createElement('div');
        businessDiv.textContent = 'ID: ${employee.id}, Name: ${employee.name}, Department: ${employee.department}, Salary: ${employee.salary}';
        businessListDiv.appendChild(businessDiv);       
    });
}