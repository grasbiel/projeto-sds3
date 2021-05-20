import DashBoard from 'pages/dashboard';
import Home from 'pages/home';
import {BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact >
                    <Home />
                </Route>

                <Route path="/dashboard" exact >
                    <DashBoard />
                </Route>    
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;