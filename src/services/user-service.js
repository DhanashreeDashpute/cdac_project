import { myAxios} from "./helper";

export const signUp = (user) => {
    // Make a POST request to the register customer endpoint
    return myAxios.post('/api/customers', user)
        .then(response => {
            // Handle the response and return the data
            return response.data;
        })
        .catch(error => {
            // Handle any errors
            console.error('Error signing up:', error);
            throw error;
        });
};
